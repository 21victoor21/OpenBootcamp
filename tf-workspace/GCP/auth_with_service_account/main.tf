terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
      version = "4.76.0"
    }
  }
}

provider "google" {
  # Configuration options
  project = "my-project-terraform-394816"
  region = "us-central1"
  zone = "us-central1-a"
  credentials = "key_jason.json"
}

resource "google_storage_bucket" "Pruebas2023GCPAgente" {
    name = "bucket-from-tf-using-auth2023"
    location = "US"
}