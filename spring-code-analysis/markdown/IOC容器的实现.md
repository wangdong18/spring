# IOC容器的实现

## ioc容器概述

> spring中ioc可以在对象生成或者初始化时将数据注入到对象中，也可以通过将对象引入注入到对象 数据域中的方式来注入对象调用的依赖。
>
> 这种依赖注入是可以递归的的，对象被逐层注入。
>
> ## BeanFactory和ApplicationContext
>
> >BeanFactory对ioc容器的