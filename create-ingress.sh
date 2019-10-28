kubectl -n cesar expose deployment telequark --type=LoadBalancer --name=telequark
sleep 15
kubectl get -n cesar svc telequark -o=jsonpath='{@.status.loadBalancer.ingress[0].hostname}'