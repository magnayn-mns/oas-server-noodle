Merge with API-first

You can do this with git itself if you're prepared to keep swagger changes entirely on a single branch, that
then gets merged into mainline as a 3-way merge. I.E: Process would be

- check out openapi branch
- make swagger.yaml changes
- run generate-server.sh
- commit all changes
- switch back to mainline, merge in (should get no conflicts in spite of implementation changing, because of common ancestor).



Alternatively something like this works (Using opendiff here which is a mac application, but I'm sure vimdiff or similar would work):

- Check out mainling
- Make some change to swagger.yaml (e.g: add an attribute)
- Run update-swagger.sh
- Merge changes in opendiff (hide identical changes)