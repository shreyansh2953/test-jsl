
import com.files.Test;
import trackfone.devops.Build
import trackfone.devops.Test2
import java.util.*;

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
               stage('DSA')
               {
                   def ar = new ArrayList<>();

                         ar.add(5);
                         ar.add(10);
                         ar.add(7);
                         ar.add(9);
                         ar.add(["hii","bye"]);

                       for (ele in ar) {
                                 println ele
                           
                             }
                             println ar.getClass()

               }
        }

   }
   catch(e)
   {
       println e
   }
}