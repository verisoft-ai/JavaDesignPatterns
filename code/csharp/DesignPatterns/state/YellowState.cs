namespace State;
using System;

class YellowState : IState
{
    public void HandleRequest()
    {
        Console.WriteLine("Yellow light - Caution!");
        // Logic to switch to the red light
    }
}
