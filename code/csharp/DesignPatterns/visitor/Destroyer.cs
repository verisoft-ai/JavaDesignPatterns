using System;

namespace Visitor
{
    public class Destroyer : IVisitor
    {
        public void VisitPainting(Painting painting)
        {
            Console.WriteLine("Destroyer destroys the painting");
        }

        public void VisitSculpture(Sculpture sculpture)
        {
            Console.WriteLine("Destroyer destroys the sculpture");
        }
    }
}
