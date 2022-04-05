
import com.files.Test;
import trackfone.devops.Build
import trackfone.devops.Test2
import java.util.*;
import groovy.json.*

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

                        //    coming from Jenkins parameters
                             println "hello ${str}"


                            //  playing with json in jenkins
                       def myjson = '{"name":"shreyansh","age":"22","value":{"output":"ok"}}'
                         def slurper = new  JsonSlurperClassic().parseText(myjson)
                         println slurper.value.output
                         println slurper.getClass()
                         println slurper.value


                        def jsonSlurper = new JsonSlurperClassic()
                        Object lst = jsonSlurper.parseText('{}')
                         lst.name = "shreyansh"
                        print lst
                        print lst.getClass()
                          

                        //   print z pattern
                       for(int i=0;i<5;i++)
                       {
                           for(int j=0;j<5;j++)
                           {
                               if(i==0 || i==4)
                               {
                                   print "* "
                               }
                               else
                               {
                                   if(j == 5-i-1)
                                   {
                                       print "* "
                                   }
                                   else
                                   {
                                       print "  "
                                   }
                               }

                           }
                               println " "

                       }

               }
        }

   }
   catch(e)
   {
       println e
   }
}