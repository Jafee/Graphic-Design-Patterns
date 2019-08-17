## Decorator Design Pattern

**装饰边框与装饰物的一致性。**

不断地为对象添加装饰物的模式被称为 Decorator 模式。


### Decorator 例子 UML

![factoryMethod-example](./resource/factoryMethod-example.png)

### 类的一览表

| 名字                                  | 说明                            |
| ------------------------------------- | ------------------------------- |
| [Display](./Display.java)             | 用于显示字符串的抽象类          |
| [StringDisplay](./StringDisplay.java) | 用于显示单行字符串的类      |
| [Border](./Border.java)               | 用于显示装饰边框的抽象类             |
| [SideBorder](./SideBorder.java)       | 用于只显示左右边框的类 |
| [FullBorder](./FullBorder.java)       | 用于显示上下边框的类                               |
| [Main](./Main.java)                   | 测试程序行为的类                |



### Decorator UML

![factoryMethod](./resource/factoryMethod.png)

### Decorator Method 模式中的角色

- `Component` ：增加功能时的核心角色。
- `ConcreteComponent`：该角色是实现了 Component 角色所定义的接口的具体类。
- `Decorator` （装饰物）：该角色具有与 Component 角色相同的接口。在它内部保存了被装饰的对象——Component角色。
- `ConcreteDecorator` （具体的装饰物）

### 接口的透明性

在 Decorator 模式中，装饰边框与被装饰边框具有一致性。例如：表示装饰边框的Border类是装饰物Display类的子类，这就体现了**一致性**。也就是说，Border 类（以及它的籽类）与表示被装饰物的Display类具有相同的接口。

这样，即使装饰物被边框装饰了起来，接口也不会被隐藏起来。其他类依然可以调用 `getColumn`, `getRows`, `getRowText` 以及 `show` 方法。这就是接口（API）的透明性。

在示例程序中 display4 被装饰了多次，但是接口（API）却没发生任何变化。

Decorator 模式与Composite模式一样具有递归结构，但它们的使用目的不同。**Decorator模式主要的目的是通过添加装饰物来增加对象的功能。**

### 在不改变被装饰物的前提下增加功能

装饰边框与被装饰物具有相同的接口（API）。虽然接口是相同的，但是装饰越多功能则越多。在例子中，Display 被 SideBorder 装饰后字符串左右两侧加上了装饰字符。如果在用 FullBorder 装饰，那么就可以在字符串的四周加上边框。此时我们不需要对被装饰类做任何修改，就**实现了不修改被装饰的类即可增加功能**。

### 可以动态地增加功能

Decorator 模式中用到了委托，它是类之间形成了弱关联关系。因此，不用改变框架代码，就可以生成一个与其他对象具有不同关系的新对象。

### java.io 包与Decorator模式

```java
Reader reader = new FileReader("text.txt");

Reader reader = new BufferedReader(new FileReader("text.txt"));

Reader reader = new LineNumberReader(new BufferedReader(new FileReader("text.txt")));
```

无论是LineNumberReader类的构造函数还是BufferReader类的构造函数，都可以直接接受Reader类（的子类）的实例作为参数，因此我们可以像上边那样自由地进行各种组合。

### Decorator 模式的缺点

Decorator 模式会导致程序中增加很多功能类似的很小的类。