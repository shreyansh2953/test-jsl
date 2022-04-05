
import com.files.Test;
import trackfone.devops.Build
import trackfone.devops.Test2

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
               stage('build')
               {
                   def b = new Build()
                   println b.buildNow()
               }
               stage('bye')
               {
                   def c = new Test2()
                   println c.sayBye("arihant")
               }
        }

   }
   catch(e)
   {
       println e
   }
}