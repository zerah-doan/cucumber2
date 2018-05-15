package abc;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Main {
    //  public static void main(String[] args) {
//        ChromeOptions options1 = new ChromeOptions();
//        options1.addArguments("start-maximized");
//        WebDriverManager.setWebDriver("gc", options1);
//        WebDriverManager.dismissWebDriver();

//        WebDriverManager.setWebDriver(WebDriverFactory.createInstance("gc"));
//        WebDriverManager.setWebDriver(WebDriverFactory.createInstance("ff"));
//        WebDriverManager.dismissWebDriver();


//        FirefoxOptions options2 = new FirefoxOptions();
//        options2.addArguments("start-maximized");
//        WebDriver wd2 = WebDriverFactory.createInstance("ff", options2);
//        wd2.quit();
    //  }

//    public static void main(String[] args) throws JSchException, IOException {
//        JSch jsch = new JSch();
//
//        Session session;
//        try {
//
//            // Open a Session to remote SSH server and Connect.
//            // Set User and IP of the remote host and SSH port.
//            session = jsch.getSession("testuser", "192.168.1.1", 22);
//            // When we do SSH to a remote host for the 1st time or if key at the remote host
//            // changes, we will be prompted to confirm the authenticity of remote host.
//            // This check feature is controlled by StrictHostKeyChecking ssh parameter.
//            // By default StrictHostKeyChecking  is set to yes as a security measure.
//            session.setConfig("StrictHostKeyChecking", "no");
//            //Set password
//            session.setPassword("testPassword");
//            session.connect();
//
//            // create the execution channel over the session
//            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
//            // Set the command to execute on the channel and execute the command
//            channelExec.setCommand("sh myscript.sh Rajesh");
//            channelExec.connect();
//
//            // Get an InputStream from this channel and read messages, generated
//            // by the executing command, from the remote side.
//            InputStream in = channelExec.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Command execution completed here.
//
//            // Retrieve the exit status of the executed command
//            int exitStatus = channelExec.getExitStatus();
//            if (exitStatus > 0) {
//                System.out.println("Remote script exec error! " + exitStatus);
//            }
//            //Disconnect the Session
//            session.disconnect();
//        } catch (JSchException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }


//    public static void main(String[] arg) {
//
//        try {
//            JSch jsch = new JSch();
//            Session session = jsch.getSession("energydb", "asu-eeback.nz.hsntech.int", 22);
//            session.setConfig("StrictHostKeyChecking", "no");
//            session.setPassword("energydb");
//            session.connect(30000);
//
//            Channel channel = session.openChannel("shell");
//            channel.setOutputStream(System.out);
//            OutputStream toSV = channel.getOutputStream();
//            channel.connect(3 * 1000);
//            Thread.sleep(1000);
//            String cmd = "pwd\n";
//            System.out.println("aaaaaa");
//            toSV.write(cmd.getBytes(UTF8));
//            toSV.flush();
//
//
//            channel.disconnect();
//            session.disconnect();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }

    public static void main(String[] arg) {

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession("energydb", "asu-eeback.nz.hsntech.int", 22);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword("energydb");
            session.connect(30000);
            Channel channel = session.openChannel("shell");
            channel.connect();

            DataInputStream dataIn = new DataInputStream(channel.getInputStream());
            DataOutputStream dataOut = new DataOutputStream(channel.getOutputStream());

            // send ls command to the server
            dataOut.writeBytes("pd_shell\r\n");
            dataOut.flush();

            Thread.sleep(2000);
            dataOut.writeBytes("3");
            dataOut.flush();

            Thread.sleep(2000);
            dataOut.writeBytes("3");
            dataOut.flush();

            Thread.sleep(2000);
            dataOut.writeBytes("exit\r\n");
            dataOut.flush();

            Thread.sleep(2000);
            dataOut.writeBytes("pwd\r\n");
            dataOut.flush();

            // and print the response
            String line = dataIn.readLine();
            System.out.println(line);
            while (!line.endsWith(" # ")) {
                System.out.println(line);
                line = dataIn.readLine();
            }
            dataIn.close();
            dataOut.close();
            channel.disconnect();
            session.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
