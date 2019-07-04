package stackpac;
/* Ata kintu dynamic na static*/
public class Stack {

        int stack[];//dynamic o korte parbo
        int top;
        public Stack() {
            stack = new int[10];//dynamic o korte parbo
            top = 0;
        }

    public void push(int data){
        if(top == 10)
            System.out.println("Stack is full");
        else {
            stack[top] = data;
            top++;
        }

    }

    public int pop(){
        int data = 0;
        if(isEmpty())
            System.out.println("Stack is empty");
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
         return data;
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }

    public int size(){
        return  top;
    }
    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        for (int n: stack) {

            System.out.println(n + " ");
        }
    }
}
