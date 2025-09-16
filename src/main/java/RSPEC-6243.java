public class App implements RequestHandler<Object, Object> {
    @Override
    public Object handleRequest(final Object input, final Context context) {
      S3Client s3Client = DependencyFactory.s3Client();
      s3Client.listBuckets();
      // ...
    }
}
