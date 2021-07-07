def call(String buildparams){

if (buildparams == "dotnetframework")
 {
     script {
            echo  "Msbuild dotnetframework steps"
            }
 }

else if (buildparams == "dotnetcore")
 {
     script {
            echo  "dotnetcore steps"
            }
 }
else if (buildparams == "maven")
 {
     script {
            echo  "maven steps"
            }
 }
else if (buildparams == "gradle")
 {
     script {
            echo  "gradle steps"
            }
 }

}


