/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aws.access.policy.test;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class S3AccessPolicyTest {
    public static void main(String[] args) {
        AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
        s3.putObject("bucket1", "hello", "content");
    }
}
