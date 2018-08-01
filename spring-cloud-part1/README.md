# spring-cloud-part1
## part1 服务之间的调用,ribbon和feign消费方式
学习springcloud自己敲的demo


1. 启动eurekaServer,相当于注册中心,其他的client的注册url都是eurekaServer的url
2. 在idea中,启动配置edit Configurations...中的右上角,有一个Single instance only,把它的勾去掉,就可以一个工程启动多个实例了
3. 启动eureka-client-01,再更改端口后再启动eureka-client-01,这就相当于是一个集群


