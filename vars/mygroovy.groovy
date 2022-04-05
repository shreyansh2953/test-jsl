
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

                       

               }

               stage('file')
               {
                   deleteDir()
                   sh "touch xyz.txt"
                   sh "chmod +777 xyz.txt"
                   sh "ls -la"
                   sh "pwd"
                   def wf = new FileWriter("/var/lib/jenkins/workspace/test-jsl-pipeline/xyz.txt")
                   wf.write("hii hello ..... ")
                   wf.close() 
               }
        }

   }
   catch(e)
   {
       println e
   }
}