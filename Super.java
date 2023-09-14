class Super
{ 
    public int i = 0; 
    Super(){

    }

    public Super(String text) /* Line 4 */
    {
        i = 1; 
    } 
    public static void main(String args[]){

    }
} 

class Sub extends Super
{
    public Sub(String text)
    {
        i = 2; 
    } 

    public static void main(String args[])
    {
        Sub sub = new Sub("Hello"); 
        System.out.println(sub.i); 
    } 
}