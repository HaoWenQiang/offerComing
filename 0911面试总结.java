2020 09 面试总结

百炼智能：
	笔试
		1. 类加载过程
			class Student{
				static Student instant = new Student();
				static int count = 1;
				Student(){
					System.print.out(count)
				}
				public static Student getInstant(){
					return instant;
				}
				public static void main(String[] args) {
					Student.getInstant();
				}
			}

		2. 装箱
		public static void main(String[] args) {
			List<Long> theList =  new ArryList();
			theList.add(null);
			theList.add(1);
			long count = 0;
			for (Long num : theList) {
				count += num;
			}
			System.out.print(count);
		}

		3. 手写二分查找
		4. 常用排序的时间复杂度
		5. Persion 有两个属性 一个String 的name，一个int的age，手写：重写 equals方法 
	面试：
		1
		fianl 说说关键字，然后为啥不可修改，因为JVM模型 分配在方法区了，进而聊到了JVM内粗模型
		2
		说说项目，对比一下Flink Strom Spark ，一个即兴问题，
		在几个亿火车乘坐信息里，找到每个人的关系，比如某个人历史上出现了两次以上和另外一个人连着座
		说说思路，Hbase存储，初步筛选，将只做过一次的清除，将座位号转换为数字
		然后每个关系存到图数据库，例如：Neo4j
		说说如何对 海量的敏感字段脱敏和压缩，比如手机号
		3
		数据库连接池是怎么优化的：线程数量和 过多的设置线程池个数问题
		遇到过的难题
		线程池 ，Java中的线程
		redies 常用的数据结构

阿里巴巴：电话面
	项目描述
	kafka为啥快
	kafka的可靠性用什么保证
	一个partition可以被多个Consumer消费嘛
	JVM模型
	full gc的执行时间，如何查看gc都清理了哪些类
	hashmap hashtabel concurrentHashmap 区别
	hashmap put 的过程
	hashcode 和 equal 结果不同时 hashmap 会看哪个结果
	线程池 主要参数
	workQueue ， 当有 corePoolSize ，策略
	线程池，最大连接数15，最小连接数3，核心连接数5，现在是有3个连接在工作了，当在过来一个连接时，先进入线程池还是先进入队列
	spirng AOP
	springboot 自动装配

58安全信息部：
	线程池 
	workqueue
	超过核心线程 进队列 队列满了  初始化 最大线程 都满了 拒绝策略
	核心线程
	java锁机制

	ThreadLocal 线程结束后是自动清楚线程缓存的值还是要手动清除
	用ThreadLoacal 模拟 8个人赛跑，如何保证同一时间起跑 ，CountDown
	Redis String类型是如何存储的

	concurrentHashmap 如何分片 如何找到分片的


















