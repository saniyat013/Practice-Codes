
import java.util.Arrays;
import java.util.Scanner;


public class Stack {
    static int stack[];
    static int top = -1;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Stack:");
        int size = sc.nextInt();
        stack = new int[size];
        Arrays.fill(stack, -1);
        
        push(stack, 5);
        push(stack, 10);
        push(stack, 15);
        push(stack, 20);
        System.out.println("Max in Stack: " + max(stack));
        System.out.println("Min in Stack: " + min(stack));
        System.out.println("Size of Stack: " + size(stack));
        System.out.println("Number of Elements in Stack: " + count(stack));
        System.out.println("Top of Stack: " + top(stack));
        System.out.println("Element Popped: " + pop(stack));
        System.out.println("Top of Stack: " + top(stack));
        System.out.println("Max in Stack: " + max(stack));
        System.out.println("Min in Stack: " + min(stack));
    }
    
    static void push(int stack[], int n){
        if(top >= stack.length)
            System.out.println("Stack is Full");
        else
            stack[++top] = n;
    }
    
    static int pop(int stack[]){
        if(top < 0){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            int temp = stack[top];
            stack[top] = -1;
            top--;
            return temp;
        }            
    }
    
    static int top(int stack[]){
        if(top < 0){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return stack[top];
        }  
    }
    
    static int max(int stack[]){
        int max = stack[0];
        for(int x: stack){
            if(max < x)
                max = x;
        }
        return max;
    }
    
    static int min(int stack[]){
        int min = stack[0];
        for(int x: stack){
            if(min > x && x > -1)
                min = x;
        }
        return min;
    }
    
    static int size(int stack[]){
        return stack.length;
    }
    
    static int count(int stack[]){
        int i = 0, count = 0;
        while(stack[i++] >= 0){
            count++;
        }
        return count;
    }
}
