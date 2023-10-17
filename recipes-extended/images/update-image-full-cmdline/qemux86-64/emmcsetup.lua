function preinst()
	local out = "Preinstall script called"
	return true, out
end

function postinst()
	local out = "Postinstall script called"
	return true, out
end
