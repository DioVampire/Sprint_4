package ru.yandex.praktikum.pageObject;

// Кнопка принятия cookies
private By cookiesButton = By.id("rcc-confirm-button");

// Вкладка первого вопроса FAQ
private By firstQuestion = By.id("accordion__heading-0");

// Вкладка первого ответа FAQ
private By firstAnswer = By.cssSelector("#accordion__panel-0 > p");

// Вкладка второго вопроса FAQ
private By secondQuestion = By.id("accordion__heading-1");

//Вкладка второго ответа FAQ
private By secondAnswer = By.cssSelector("#accordion__panel-1 > p");

//Вкладка третьего вопроса FAQ
private By thirdQuestion = By.id("accordion__heading-2");

//Вкладка третьего ответа FAQ
private By thirdAnswer = By.cssSelector("#accordion__panel-2 > p");

//Вкладка четвертого вопроса FAQ
private By fourthQuestion = By.id("accordion__heading-3");

//Вкладка четвертого ответа FAQ
private By fourthAnswer = By.cssSelector("#accordion__panel-3 > p");

//Вкладка пятого вопроса FAQ
private By fifthQuestion = By.id("accordion__heading-4");

//Вкладка пятого ответа FAQ
private By fifthAnswer = By.cssSelector("#accordion__panel-4 > p");

//Вкладка шестого вопроса FAQ
private By sixthQuestion = By.id("accordion__heading-5");

//Вкладка шестого ответа FAQ
private By sixthAnswer = By.cssSelector("#accordion__panel-5 > p");

//Вкладка седьмого вопроса FAQ
private By seventhQuestion = By.id("accordion__heading-6");

//Вкладка седьмого ответа FAQ
private By seventhAnswer = By.cssSelector("#accordion__panel-6 > p");

//Вкладка восьмого вопроса FAQ
private By eighthQuestion = By.id("accordion__heading-7");

//Вкладка восьмого ответа FAQ
private By eighthAnswer = By.cssSelector("#accordion__panel-7 > p");

//Верхняя кнопка заказа
private By upperOrderButton = By.cssSelector(".Header_Nav__AGCXC > .Button_Button__ra12g");

//Нижняя кнопка заказа
private By lowerOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");

//Поле имя
private By nameField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(1) > .Input_Responsible__1jDKN");

//Поле фамилия
private By surnameField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(2) > .Input_Input__1iN_Z");

//Поле адрес
private By addressField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(3) > .Input_Input__1iN_Z");

//Поле станции
private By stationField = By.cssSelector(".select-search__input");

//Выбор станции, data-index задается в виде 1,2 и т.д
private By stationDropdown = By.xpath(".//div[@class='select-search__select']/ul/li[@data-index='%s']/button");

//Поле телефон
private By phoneField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(5) > .Input_Input__1iN_Z");

//Кнопка Далее
private By nextButton = By.cssSelector(".Button_Middle__1CSJM");

//Поле календаря
private By calendarField = By.cssSelector(".react-datepicker__input-container");

//Дропдаун календаря
private By calendarDropdown = By.cssSelector(".react-datepicker-ignore-onclickoutside");

//Выбор дня, day задается в виде 001, 002 и т.д
private By calendarOption = By.cssSelector(".react-datepicker__day--%s");

//Поле периода аренды
private By arendaPeriodField = By.cssSelector(".Dropdown-placeholder");

//Выбор опции аренды, text задается в виде сутки, двое суток, трое суток и т.д
private By arendaOption = By.xpath(".//div[@class='Dropdown-menu']/div[contains(text(), '%s')]");

//Выбор цвета самоката, id задается в виде цвета на английском grey, black
private By colorOption = By.id("%s");

//Поле комментария
private By commentaryField = By.cssSelector(".Input_InputContainer__3NykH > .Input_Responsible__1jDKN");

//Кнопка отправки формы заказа
private By finalOrderButton = By.cssSelector(".Button_Middle__1CSJM:nth-child(2)");

//Кнопка подтверждения отправки формы
private By confirmOrderButton = By.cssSelector(".Order_Buttons__1xGrp:nth-child(2) > .Button_Button__ra12g:nth-child(2)");

//Окно подтверждения заказа
private By successMessage = By.cssSelector(".Order_ModalHeader__3FDaJ");


