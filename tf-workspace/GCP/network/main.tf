resource "google_compute_network" "auto-vpc-tf-2023"{
  name = "auto-vpc-tf-2023"
  auto_create_subnetworks = true
}

resource "google_compute_network" "custom-vpc-tf-2023"{
  name = "custom-vpc-tf-2023"
  auto_create_subnetworks = false
}

resource "google_compute_subnetwork" "sub-sg"{
  name = "sub-sg"
  network = google_compute_network.custom-vpc-tf-2023.id
  ip_cidr_range = "10.1.0.0/24"
  region = "asia-southeast1"
  private_ip_google_access = true
}

resource "google_compute_firewall" "allow-icmp"{
  name = "allow-icmp"
  network = google_compute_network.custom-vpc-tf-2023.id
  allow {
    protocol = "icmp"
  }
  source_ranges = ["177.91.253.92/32"]
  priority = 455
}

output "auto" {
  value = google_compute_network.auto-vpc-tf-2023.id
}

output "custom" {
  value = google_compute_network.custom-vpc-tf-2023.id
}