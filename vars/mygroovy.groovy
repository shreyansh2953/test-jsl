

def call()
{
   try{
         import src.com.files;
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