package _1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String url = null;

        while (!input.equals("Home"))
        {
            if (input.equals("back"))
            {

                if (browserHistory.isEmpty())
                {
                    System.out.println("no previous URLs");
                }else
                {
                    url = browserHistory.pop();
                    System.out.println(url);
                }

            }else {

                if (url!=null)
                {
                    browserHistory.push(url);
                }

                url=input;

                System.out.println(url);
            }
            input=scanner.nextLine();
        }

    }
}
