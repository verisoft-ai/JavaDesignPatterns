using System;

namespace State
{
    public class StateClient
    {
        public static void State()
        {
            TrafficLight light = new TrafficLight(new GreenState());

            // Green
            light.Perform();

            // Green to Yellow
            light.SetState(new YellowState());
            light.Perform();

            // Yellow to Red
            light.SetState(new RedState());
            light.Perform();
        }
    }
}
