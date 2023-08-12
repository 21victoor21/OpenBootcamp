resource "google_storage_bucket" "GCS2023_2023"{
  name = "terraform-course-entornodesarrollo2023"
  storage_class = "NEARLINE"
  location = "US-CENTRAL1"

  labels = {
    "env"="tf_env"
    "dep"="complience"
  }

  uniform_bucket_level_access = true

  lifecycle_rule {
    condition{
      age = 5
    }
    action{
      type = "SetStorageClass"
      storage_class = "COLDLINE"
    }
  }

  retention_policy {
    is_locked = true
    retention_period = 864000
  }

}

resource "google_storage_bucket_object" "picture2023" {
  name =  "f_logo"
  bucket = google_storage_bucket.GCS2023_2023.name
  source = "f.png"
}