能够说出List集合特点
	有序,允许重复,有索引
能够说出常见的数据结构
	堆栈:先进后出
	队列:先进先出
	数组:查询快,增删慢
	链表:查询慢,增删快
	红黑树(趋近平衡二叉树):查找的速度特别快
能够说出数组结构特点
	查询快,增删慢
能够说出栈结构特点
	先进后出
能够说出队列结构特点
	先进先出
能够说出单向链表结构特点
	查询慢,增删快
能够说出Set集合的特点
	不允许重复
	没有索引,不能使用普通for
能够说出哈希表的特点:
	查询的速度非常快
	JDK1.7:数组+链表:查询快,增删快
	JDK1.8:数组+链表/红黑树:提高查询的效率
使用HashSet集合存储自定义元素
	要求:保证同名同年龄的人是同一个人,自定义类型必须重写hashCode和equals方法(快捷键 alt+insert-->选择equals and hashCode)
	HashSet<Person> set = new HashSet<Person>();
能够使用集合工具类
	public static void shuffle(List<?> list):打乱集合顺序。
	public static <T> void sort(List<T> list):将集合中元素按照默认规则(升序)排序。
	public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。
能够使用Comparator比较器进行排序
	升序排列/降序排列的口诀：升序就是o1-o2,降序反之