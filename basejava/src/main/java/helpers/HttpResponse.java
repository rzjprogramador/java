package helpers;

public class HttpResponse<T> {
  public int statusCode;
  public T data;

  public HttpResponse(int s, T d) {
    this.statusCode = s;
    this.data = d;
  }

  @SuppressWarnings("unchecked")
  public static <AnyType> HttpResponse<AnyType> ok(int s, AnyType d) {
    s = 200;
    HttpResponse<AnyType> instance = new HttpResponse(s, d);
    System.out.println(s);
    System.out.println(d);
    return instance;
  }

  @SuppressWarnings("unchecked")
  public static HttpResponse<Exception> fail(int s, String d) {
    s = 400;
    HttpResponse<Exception> instance = new HttpResponse(s, d);
    System.out.println(s);
    System.out.println(d);
    return instance;
  }

}