###白琦琦的SpringCloud练习      
使用了SpringCloud中国社区的公益Eureka Server   
SpringCloud中国社区社区主页: http://springcloud.cn/   
Eureka Server的主页: http://eureka.springcloud.cn/         
Eureka Server配置地址: http://eureka.springcloud.cn/eureka/      

使用方法,在application.yml文件中添加以下代码:   
```
eureka:
  client:
    serviceUrl:
      defaultZone: http://eureka.springcloud.cn/eureka/
```

使用maven建立了2个module,server作为服务的提供者,client作为服务的消费者,便于一起运行测试