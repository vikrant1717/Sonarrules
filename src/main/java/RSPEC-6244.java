SendEmailRequest.builder()
  .destination(Destination.builder()
    .toAddresses("to-email@domain.com")
    .bccAddresses("bcc-email@domain.com")
    .build())
.build();
