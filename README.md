# 试验spring-boot日志

```io.dracula.test.boot.logging.TestLog```每2秒打印```trace```、```debug```、```info```、```trace```、```warn```和```error```级别日志。

引入```actuator```，可用```/actuator/loggers```端点。
向```/actuator/loggers/{logger名}```发送```POST```，数据```{configuredLevel: 新level}```即可。
例如：
```
curl localhost:8080/actuator/loggers/io.dracula.test.boot.logging.TestLog -XPOST -H "Content-Type: application/json" -d "{"""configuredLevel"""":"""off"""}"
```