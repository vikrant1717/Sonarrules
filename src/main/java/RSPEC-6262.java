import com.amazonaws.services.s3.AmazonS3ClientBuilder;

AmazonS3ClientBuilder.standard().withRegion("eu_west_1").build(); // Noncompliant: hardcoded region string
