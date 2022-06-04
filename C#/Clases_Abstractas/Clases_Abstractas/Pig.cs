using System;

namespace Clases_Abstractas
{
    class Pig:Animal
    {
        public Pig(string name) : base(name)
        {

        }
            
        public override void animalsound()
        {
            Console.WriteLine(name + " hace wewwe");
        }    

    }
}
