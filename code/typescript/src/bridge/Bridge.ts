import { Television } from "./Television";
import { Device } from "./Device";

let tv: Device = new Television();
tv.powerOn();
tv.adjustVolume(30);
tv.changeChannel(5);
tv.powerOff();
