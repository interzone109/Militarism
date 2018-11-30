package com.militarism2.militarism2.game.unity.able;

import com.militarism2.militarism2.game.unit.feature.Stock;

/**
 * Интерфейс Supportable использаеться классом Support для 
 * доствки продовольствия и для создания взлетно-посадочной полосы
 */
public interface Supportable extends Warable {

	Stock suppot();

	boolean runway(Flyable flyable);
}
