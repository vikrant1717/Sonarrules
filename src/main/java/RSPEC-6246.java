import com.amazonaws.services.lambda.*;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;

InvokeRequest invokeRequest = new InvokeRequest()
         .withFunctionName("myFunction");

AWSLambda awsLambda = AWSLambdaClientBuilder.standard()
        .withCredentials(new ProfileCredentialsProvider())
        .withRegion(Regions.US_WEST_2).build();

awsLambda.invoke(invokeRequest); // Noncompliant: synchronous invocation from Lambda
