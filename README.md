# Паттерны (Patterns)

---

Паттерн - решение задачи в контексте.

Контекстом называется ситуация, в которой применяется паттерн. Ситуация должна быть достаточно типичной и распространенной.

Задачей называется цель, которой вы хотите добиться в контексте, в савокупности со всеми ограничениями, присущими контексту.

Решением называется обобщенная архитектура, которая достигает заданной цели при соблюдении набора ограничений.

Изменяемость, взаимозаменяемость, расширяемость. Код открыт для расширения, и закрыт для изменения.

---

<h3>Принципы проектирования:</h3>
1. Выделите аспекты приложения, которые могут измениться, и отделите их от тех которые всегда остаются постоянными.<br>
2. Проектируйте на уровне интерфейса, а не на уровне реализации.<br>
3. Отдавайте предпочтение композиции перед наследованием.<br>
4. Стремитесь к слабой связанности взаимодействующих объектов.<br>
5. Классы должны быть открыты для расширения, но закрыты для изменения.<br>
6. Код должен зависеть от абстракций, а не от конкретных классов.<br>
7. Принцип минимальной информированности: общайтесь только с близкими друзьями.<br>
8. Не вызывайте нас - мы Вас сами вызовем. (Алгоритм определяется суперклассом, поэтому последний должен сам обращаться к субклассам, когда потребуется).<br>
9. Класс должен должен иметь только одну причину для изменения (Каждому классу должна быть выделена только ОДНА обязанность).<br>

---

<h3>Стратегия (Strategy)</h3>
Стратегия - Определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость. Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.

Стратегия часто используется в Java-коде, особенно там, где нужно подменять алгоритм во время выполнения программы. Начиная с Java 8, многие примеры стратегии можно заменить простыми lambda-выражениями. Применяется при наличии большого количества однотипных объектов с разной реализацией некоторых свойств. Для реализации разных вариантов поведения объекта.

---

<h3>Наблюдатель (Observer)</h3>
Определяет отношение "Один ко многим" между объектами таким образом, что при изменении состояния одного объекта происходит автоматическое оповещение и обновление всех зависимых объектов.

Встроенная реализаця в языке Java:
Интерфейс Observer и класс Observable из пакета java.util. Отличается порядком оповещения наблюдателей. Из-за наличия ограничений приоритет отдавать собственной реализации. Swing API - JButton. JavaBeans - PropertyChangeListener.

---

<h3>Декоратор (Decorator)</h3>
Динамически наделяет объект новыми возможностями и является гибкой альтернативой субклассированию в области расширения функциональности.

---

<h3>Фабрика (Factory)</h3>
Определяет интерфейс создания объекта, но позволяет субклассам выбрать класс создаваемого экземпляра. Таким образом, Фабричный метод делегирует операцию создания экземпляра субклассам.

Абстрактная фабрика:
Предоставляет интерфейс создания семейств взаимосвязанных или взаимозависимых объектов без указания их конкретных классов.

---

<h3>Одиночка (Singleton)</h3>
Гарантирует, что класс имеет только один экземпляр, и предоставляет глобальную точку доступа к этому экземпляру.

---

<h3>Команда (Team)</h3>
Инкапсулирует запрос в виде объекта, делая возможной параметризацию клиентских объектов с другими запросами, организацию очереди или регистрацию запросов, а так же поддержка отмены операции.

---

<h3>Адаптер (Adapter)</h3>
Преобразует интерфейс класса к другому интерфейсу, на который рассчитан клиент. Адаптер обеспечивает совместную работу классов, невозможную в обычных условиях из-за несовместимости интерфейсов.

---

<h3>Фасад (Facade)</h3>
Предоставляет унифицированный интерфейс  к группе интерфейсов подсистемы. Фасад определяет высокоуровневый интерфейс, упрощающий работу с подсистемой.

---

<h3>Шаблонный метод (Template method)</h3>
Определяет "скелет" алгоритма в методе, оставляя определение реализации некоторых шагов субклассам. Субклассы могут переопределять некоторые части алгоритма без изменения его структуры.

---

<h3>Итератор (Iterator)</h3>
Предоставляет механизм последовательного перебора элементов коллекции без раскрытия её внутреннего представления.

---

<h3>Компоновщик (Linker)</h3>
Объединяет объекты  в древовидные структурыдля представления иерархий часть/целое. Компоновщик позволяет клиентувыполнять однородные операции с отдельными объектами и их савокупностями.

---

<h3>Состояние (Condition)</h3>
Управляет состоянием поведения объекта при изменении его внутреннего состояния. Внешне это выглядит так, словно объект меняет свой класс.

---

<h3>Заместитель (Deputy)</h3>
Предоставляет суррогатный объект, управляющий доступом к другому объекту.

- Удаленный заместитель управляет доступом к удаленному объекту;
- Виртуальный заместитель управляет доступом к ресурсу, создание которого требует больших затрат ресурсов;
- Защитный заместитель контролирует доступ к ресурсу в соответствии с системной привилегией.

Разновидности заместителей:
- Фильтрующий заместитель - управляет доступом к группам сетевых ресурсов, защищая их от "недобросовестных" клиентов;
- Умная ссылка  - обеспечивает выполнение дополнительных действий при обращении к объекту (например изменение ссылок счетчика);
- Кэширующий заместитель - обеспечивает временное хранение результатов высокозатратных операций. Также может обеспечивать совместный доступ к результатам для предотвращения лишних вычислений или пересылки данных по сети.
- Синхронизирующий заместитель - предоставляет безопасный доступ к объекту из нескольких программных потоков.
- Упрощающий заместитель - скрывает сложность и управляет доступом к сложному набору классов. Иногда по очевидным соображениям называется фасадным заместителем. Упрощающий заместитель отличается от паттерна фасад тем, что первый управляет доступом, а второй только предоставляет альтернативный интерфейс.
- Заместитель отложенного копирования - задерживает фактическое копирование объекта до момента выполнения операции с копией (Разновидность виртуального заместителя).

---

<h3>Составные паттерны (Composite Patterns)</h3>
Сщставной паттерн определяет два и более базовых паттерна в решении типичной или общей задачи.
Пример MVC - Модель - Представление - Контроллер.

---

<h3>Мост (Bridge)</h3>
Структурный паттерн проектирования, который разделяет один или несколько классов на две отдельные иерархии - абстракцию и реализацию, позволяя изменять их независимо друг от друга.

Применимость: Паттерн Мост особенно полезен когда вам приходится делать кросс-платформенные приложения, поддерживать несколько типов баз данных или работать с разными поставщиками похожего API (например, cloud-сервисы, социальные сети и т. д.)

---

<h3>Строитель (Builder)</h3>
Строитель — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово. Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.

Применимость: Паттерн можно часто встретить в Java-коде, особенно там, где требуется пошаговое создание продуктов или конфигурация сложных объектов.

---

<h3>Цепочка обязанностей (Chain of duty)</h3>
Поведенческий паттерн проектирования, который позволяет передавать запросы последовательно по цепочке обработчиков. Каждый последующий обработчик решает, может ли он обработать запрос сам и стоит ли передавать запрос дальше по цепи. Избавляет от жёсткой привязки отправителя запроса к его получателю, позволяя выстраивать цепь из различных обработчиков динамически.

Область применения цепочки обязанностей — всевозможные обработчики событий, последовательные проверки доступа и прочее.

---

<h3>Посредник (Mediator)</h3>
Поведенческий паттерн проектирования, который позволяет уменьшить связанность множества классов между собой, благодаря перемещению этих связей в один класс-посредник. Упрощает коммуникацию между компонентами системы. Посредник убирает прямые связи между отдельными компонентами, заставляя их общаться друг с другом через себя.

Применимость: Связь нескольких компонентов GUI одной программы.

---

<h3>Прототип (Prototype)</h3>
Порождающий паттерн проектирования, который позволяет копировать объекты, не вдаваясь в подробности их реализации. Все классы—Прототипы имеют общий интерфейс. Поэтому вы можете копировать объекты, не обращая внимания на их конкретные типы и всегда быть уверены, что получите точную копию. Клонирование совершается самим объектом-прототипам, что позволяет ему скопировать значения всех полей, даже приватных.

---

<h3>Посетитель (Visitor)</h3>
Поведенческий паттерн проектирования, который позволяет добавлять в программу новые операции, не изменяя классы объектов, над которыми эти операции могут выполняться.