import java.util.Arrays;
import java.util.Scanner;

class StackModel{
    int stack[];
    int top;
    
    StackModel(int n){
        stack = new int[n];
        top = -1;
        Arrays.fill(stack, -1);
    }
    
    int push(int n){
        if(this.top + 1 >= this.stack.length){
            return -1;
        }else{
            this.stack[++top] = n;
            return 0;
        }     
    }
    
    void pop(){
        if(top < 0){
            System.out.println("Stack is Empty");
        }else{
            int temp = stack[top];
            stack[top] = -1;
            top--;
            System.out.println("Popped item: " + temp);
        }            
    }
    
    void top(){
        if(top < 0){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top of the Stack: " + stack[top]);
        }  
    }
    
    void max(){
        int max = stack[0];
        for(int x: stack){
            if(max < x)
                max = x;
        }
        System.out.println("MAX item in the Stack: " + max);
    }
    
    void min(){
        int min = stack[0];
        for(int x: stack){
            if(min > x && x > -1)
                min = x;
        }
        System.out.println("MIN item in the Stack: " + min);
    }
    
    void size(){
        System.out.println("Size of the Stack: " + stack.length);
    }
    
    void count(){
        System.out.println(this.top);
        int count = 0;
        for (int i = 0; i < this.stack.length; i++) {
            if(this.stack[i] >= 0)
                count++;
            else
                break;
        }
        System.out.println("Number of items in the Stack: " + count);
    }
}

public class Stack {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k, n, result;
        
        do{
            System.out.println("Enter the size of the Stack: ");
            j = sc.nextInt();
            StackModel stack = new StackModel(j);
            
            do{
                System.out.println("Implementation of Stack. Enter your choice:"
                + "\n1. Push item into Stack"
                + "\n2. Pop an item"
                + "\n3. View top item of the Stack"
                + "\n4. Find the MAX item"
                + "\n5. Find the MIN item"
                + "\n6. Size of the Stack"
                + "\n7. Number of elements of the Stack"
                + "\n0. Exit");
                i = sc.nextInt();

                switch(i){
                    case 1:{
                        System.out.println("Enter item to insert: ");
                        n = sc.nextInt();
                        result = stack.push(n);
                        if(result == -1){
                            System.out.println("Stack is FULL. Can't Insert");
                        }else{
                            System.out.println(n + " inserted to the Stack");
                        }
                        break;
                    }
                    case 2:{
                        stack.pop();
                        break;
                    }
                    case 3:{
                        stack.top();
                        break;
                    }
                    case 4:{
                        stack.max();
                        break;
                    }
                    case 5:{
                        stack.min();
                        break;
                    }
                    case 6:{
                        stack.size();
                        break;
                    }
                    case 7:{
                        stack.count();
                        break;
                    }default:{
                        System.out.println("Please select a valid number.");
                    }
                }
            }while(i != 0);
            
            System.out.println("Want to create another Stack?"
                + "\n1. YES"
                + "\n2. NO");
            k = sc.nextInt();
            
        }while(k != 2);     
    }   
}
