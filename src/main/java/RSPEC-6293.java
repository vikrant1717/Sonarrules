// Noncompliant: BiometricPrompt.authenticate called without CryptoObject
BiometricPrompt biometricPrompt = new BiometricPrompt(activity, executor, callback);
biometricPrompt.authenticate(promptInfo); // Noncompliant
