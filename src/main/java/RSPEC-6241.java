S3Client.builder()
    .credentialsProvider(EnvironmentVariableCredentialsProvider.create())
    .build();
