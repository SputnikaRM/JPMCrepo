/*
Your friend John uses a lot of emoticons when you talk to him on Messenger. In addition to being a person who
 likes to express himself through emoticons, he hates unbalanced parenthesis so much that it makes him go :(. 

Sometimes he puts emoticons within parentheses, and you find it hard to tell if a parenthesis really is a
 parenthesis or part of an emoticon. A message has balanced parentheses if it consists of one of the following:

- An empty string "" 
- One or more of the following characters: 'a' to 'z', ' ' (a space) or ':' (a colon) 
- An open parenthesis '(', followed by a message with balanced parentheses, followed by a close parenthesis ')'. 
- A message with balanced parentheses followed by another message with balanced parentheses. 
- A smiley face ":)" or a frowny face ":(" 

Write a program that determines if there is a way to interpret his message while leaving the parentheses balanced.
Input:
Your program should read lines from standard input. Each line contains a message that you got from John.
Output:
Print out the string "YES"/"NO" (all quotes for clarity only) stating whether or not it is possible that the
 message had balanced parentheses.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class Parenthesis {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        System.out.println("kjnijni");
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        Stack stack=new Stack();
        while ((line = in.readLine()) != null) {
            for(int x=0;x<line.length();x++){
                if(line.charAt(x)=='(')
                    stack.push('(');
                else if(line.charAt(x)==')')
                {   if(stack.empty()){
                    System.out.println("NO");
                    break;}

                    if(stack.pop() != "("){
                        System.out.println("NO");
                        break;}
                    if(stack.pop() == "("){System.out.println("YES");}

                }
            }

        }
    }
}
