terraform {
  backend "s3" {
    bucket = "pgr301-2021-terraform-state"
    key    = "kandidat-2026-state/apprunner-actions.state"
    region = "eu-north-1"
  }
}