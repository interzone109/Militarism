package com.militarism2.militarism2.game.unity.able;

import com.militarism2.militarism2.game.unity.Machine;
import com.militarism2.militarism2.game.unity.types.Subdivision;

public interface Engineeringable {
	
	Machine buildMachine(Subdivision machineType);
}
