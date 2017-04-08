package innerclasses;

import innerclasses.controller.*;

class GreenhouseControlsOne extends GreenhouseControls {
    private boolean machine = false;

    public class MachineOn extends Event {
        public MachineOn(long delayTime){ super(delayTime);}
        public void action(){
            machine = true;
        }

        public String toString() { return "Machine is on"; }
  }

  public class MachineOff extends Event {
        public MachineOff(long delayTime){ super(delayTime);}
        public void action(){
            machine = false;
        }

        public String toString() { return "Machine is off"; }
  }

}
