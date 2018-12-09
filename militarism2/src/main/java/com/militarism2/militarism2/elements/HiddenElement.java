package com.militarism2.militarism2.elements;


//Скрытые от игрока клетки
//Пока можно отправить только авиатехнику
//Что делать если отправят пехоту или наземную технику
//Как вариант разрешить все действия, останавливать юнита если тип клетки не подходит для перемещения
public class HiddenElement extends Element /*implements IWalkableElement, ISwimmableElement,IDrivableElement*/ {

	public HiddenElement(Element newElement) {
		super(newElement);		
	}
}
