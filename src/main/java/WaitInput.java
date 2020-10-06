import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class WaitInput {
    int TypeLog;
    int number;
    MyLogger mylogger;
    @Inject @OutputC MyLogger log1;
    @Inject @OutputF MyLogger log2;
    @Inject @Output MyLogger log3;
    public void waitForInput() throws IOException {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
                String input_string = scanner.nextLine();
                System.out.println("Input type logging");
                System.out.println("Input '1' -  Logging in Console");
                System.out.println("Input '2' -  Logging in File");
                System.out.println("Input '3' -  Logging in Console and File");
                TypeLog = scanner.nextInt();
                switch (TypeLog) {
                    case 1: {
                        this.mylogger = log1;
                        break;
                    }
                    case 2: {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Input tag for input log");
                        String tag = scanner1.nextLine();
                        this.mylogger = log2;
                        mylogger.settag(tag);
                        break;
                    }
                    case 3: {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Input tag for input log");
                        String tag = scanner2.nextLine();
                        this.mylogger = log3;
                        mylogger.settag(tag);
                        number++;
                        break;
                    }
                    default: {
                        System.out.println("Error");
                        System.exit(-1);
                        break;
                    }
                }
                mylogger.Logging(input_string, number);
                number++;

        }
    }
}
