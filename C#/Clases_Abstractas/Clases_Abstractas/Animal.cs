using System;

namespace Clases_Abstractas
{
    abstract class Animal
    {
        protected string name;

        public Animal(string name)
        {
            this.name = name;
        }

        public abstract void animalsound();

        public void sleep()
        {
            Console.WriteLine(name + " esta dormido, ZZZ!");

        }
    }
}
