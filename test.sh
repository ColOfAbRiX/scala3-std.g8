#!/usr/bin/env bash
set -e

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

rm -rf target/g8

sbt g8

cd target/g8

sbt compile test styleApply styleCheck
