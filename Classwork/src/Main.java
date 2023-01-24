import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        Deque<String> queue = new ArrayDeque<>();
        //stack.push(10);
        //stack.push(20);
        //stack.push(100);
        //stack.pop();
        //System.out.println(stack.pop());
        //System.out.println(stack.peek());
        //System.out.println(stack.pop());
        //System.out.println(stack.size());
        //randomName.add(10);
        //randomName.offer(20);
        //randomName.push(30);
        //System.out.println(randomName.poll());
        //System.out.println(randomName.pop());
        //System.out.println(randomName.peek());


        //String[] tokens = input.split("\\s+");
        //int result = 0;
        //for (int i = 0; i < tokens.length; i++)
        //{
        //    stack.offer(tokens[i]);
        //}
        //while(stack.size() > 0)
        //{
        //    result = Integer.parseInt(stack.pop());
        //    String element = stack.peek()

        //    if(!element.equals("+"))
        //    {
        //        result += Integer.parseInt(stack.pop());
        //    } else if(!element.equals("-")){
        //        result -= Integer.parseInt(stack.pop());
        //    }
        //    else
        //    {
        //        System.out.println("Invalid operator");
        //    }
        //}

        //String input = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("print"))
        {
             if(input.equals("cancel"))
             {
                if(queue.isEmpty())
                {
                    System.out.println("Print");
                }
                else {
                    System.out.println("Canceled " + queue.poll());
                }
             }
             else {
                 queue.poll();
             }

            input = scanner.nextLine();
        }

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
