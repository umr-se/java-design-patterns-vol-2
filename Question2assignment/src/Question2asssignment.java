import com.sun.jdi.ThreadReference;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.ThreadStartEvent;
import com.sun.jdi.request.EventRequest;
import java.io.IOException;
public class Question2asssignment {
    // Main driver method
    public static void main(String[] args) throws InterruptedException, IOException {
            // create a new process
            System.out.println("Creating a Thread");
            ProcessBuilder builder = new ProcessBuilder("notepad.exe");
            Process pro = builder.start();
            // wait 10 seconds
            System.out.println("Waiting");
            Thread.sleep(10000);
            // kill the process
            pro.destroyForcibly();
            System.out.println("Thread destroyed");
        }
    }