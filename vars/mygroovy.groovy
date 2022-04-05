
import src.com.files;

def call()
{
   try{
       node{
               stage('test-1')
               {
                  def t = new Test();
                  def name = t.sayHii("shreyansh")
                  println name
               }
        }

   }
   catch(e)
   {
       println e
   }
}