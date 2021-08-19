package interf4ce;

/**
 * 接口不是类，而是对类的一组需求描述
 * 如果类遵循某个特定的接口，那么就履行这项服务
 * 接口中所有方法都自动属于 public
 * 接口绝不能拥有 -实例域-
 */
public interface Comparable {
    /**
     * 任何实现Comparable接口的类都需要包含compareTo方法
     * @param other 方法参数是个Object对象
     * @return 返回一个整数类型
     */
    int compareTo (Object other);
}
