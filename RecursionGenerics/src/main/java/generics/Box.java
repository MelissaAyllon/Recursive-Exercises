package generics;

public class Box<T> {
    
    private T article;

    public Box(T article) {
        this.article = article;
    }

    public T getArticle() {
        return article;
    }

    public void setArticle(T article) {
        this.article = article;
    }
    
    public static <U> void method1 (U[] array) {
    
    }
    
    
}
